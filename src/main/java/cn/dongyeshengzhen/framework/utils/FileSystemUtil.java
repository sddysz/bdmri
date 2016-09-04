package cn.dongyeshengzhen.framework.utils;

/**
 * Created by zhaoq on 2016/1/16.
 */
public class FileSystemUtil {

    /**
     * 返回webroot 本地根路径
     * F:/projects/ServiceApp/out/artifacts/ServiceApp_war_exploded/
     * @return
     */
    public static String getWebRootLocalPath(){
        String webRootLocalPath = System.getProperty("webAppRootDir");
        if(isWindows()){
            webRootLocalPath = "/" + webRootLocalPath.replace("\\", "/");
        }
        return webRootLocalPath;
    }

    private static boolean isWindows(){
        String osName = System.getProperty("os.name");
        if(osName.toLowerCase().indexOf("windows") > -1){
            return true;
        }
        return false;
    }
}
