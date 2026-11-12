public class VideoFile implements Downloadable{
    int size;
    public VideoFile(int size) {
        this.size = size;
    }

    public String getme(){
        return "Video";
    }
    @Override
    public String printt(){
        return "VideoFile{" + "size=" + size + '}';
    }
    @Override
    public void download(){
        System.out.println("Скачиваю :Video");
    }
}