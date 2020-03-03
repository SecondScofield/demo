package com.example.demo.util;

import com.example.demo.blog.config.FtpConfig;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

public class FtpUtil {

    public static String pictureUploadByConfig (FtpConfig ftpConfig, String picNewName, String picSavePath, InputStream inputStream)
            throws IOException {
        boolean flag = uploadFile(ftpConfig.getFTP_ADRRESS(),ftpConfig.getFTP_PORT(),ftpConfig.getFTP_USERNAME(),
                ftpConfig.getFTP_PASSWORD(),ftpConfig.getFTP_BASEPATH(),picSavePath,picNewName,inputStream);
        if(!flag){
            return "failure";
        }else{
            return "success";
        }

    }

    public static boolean uploadFile(String host, String ftpPort, String username, String password,
                                     String basePath, String filePath, String filename, InputStream input) {
        int port = Integer.parseInt(ftpPort);
        boolean result = false;
        FTPClient ftpClient = new FTPClient();
        try{
            ftpClient.connect(host,port);
            ftpClient.login(username,password);
            int reply = ftpClient.getReplyCode();
            if(!FTPReply.isPositiveCompletion(reply)){
                ftpClient.disconnect();
                return result;
            }
            if(!ftpClient.changeWorkingDirectory(basePath+filePath)){
                String[] dirs = filePath.split("/");
                String tempPath = basePath;
                for(String dir: dirs){
                    if(null==dir || "".equals(dir)) continue;
                    tempPath += '/' + dir;
                    if(!ftpClient.changeWorkingDirectory(tempPath)){
                        if(!ftpClient.makeDirectory(tempPath)){
                            return result;
                        }else{
                            ftpClient.changeWorkingDirectory(tempPath);
                        }
                    }
                }

            }
            //设置二进制
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            //允许被动连接
            ftpClient.enterLocalPassiveMode();
            if(!ftpClient.storeFile(filename,input)){
                return result;
            }
            input.close();
            ftpClient.logout();
            result=true;
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(ftpClient.isConnected()){
                try{
                    ftpClient.disconnect();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }
        return result;
    }

    public static String getDir( Calendar calendar){
        if(calendar != null ){
            String year = String.valueOf(calendar.get(Calendar.YEAR));
            String month = addPerfix(String.valueOf(calendar.get(Calendar.MONTH)+1));
            String day = addPerfix(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
            return "/"+year+"/"+month+"/"+day;
        }else{
            return "/2020/01/01";
        }
    }

    public static String addPerfix(String words){
        if(words.length() < 2){
            words = "0"+words;
        }
        return words;
    }
}
