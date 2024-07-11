package ss22.bai_tap.proxy_pattern;

public class FileDownloaderProxy implements Downloader {
    private FileDownloader fileDownloader;

    public FileDownloaderProxy() {
        this.fileDownloader = new FileDownloader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:89.0) Gecko/20100101 Firefox/89.0");
    }

    @Override
    public void download(String url, String destination) throws Exception {
        fileDownloader.download(url, destination);
    }

}
