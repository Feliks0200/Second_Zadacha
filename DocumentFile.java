public class DocumentFile implements Downloadable{
    int size;

    public DocumentFile(int size) {
        this.size = size;
    }

    public String getme(){
        return "Duocc";
    }
    @Override
    public String printt(){
        return "DocumentFile{" + "size=" + size + '}';
    }
    @Override
    public void download(){
        System.out.println("Скачиваю :Document");
    }
}