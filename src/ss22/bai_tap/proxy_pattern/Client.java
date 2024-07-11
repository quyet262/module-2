package ss22.bai_tap.proxy_pattern;

public class Client {
    public static void main(String[] args) {
        Downloader downloader = new FileDownloaderProxy();
        try {
            downloader.download("https://example.com/file.zip", "C:/path/to/destination/file.zip");
            System.out.println("File downloaded successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
