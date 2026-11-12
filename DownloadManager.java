import java.util.LinkedList;
import java.util.List;

public class DownloadManager implements DownloadListener,Runnable {
    public LinkedList<Downloadable> files;
    public List<Downloadable> down;

    public DownloadManager(LinkedList<Downloadable> files,List<Downloadable> down) {
        this.files = files;
        this.down = down;
    }

    @Override
    public void ddd(String a){
        System.out.println("Загрузка завершена для : "+a);
    }

    @Override
    public void run(){
        while (true) {
            Downloadable d;
            synchronized (this.files) {
                if (this.files.isEmpty()) {
                    break;
                }
                d = this.files.poll();
            }
            try {
                Thread.sleep(500);
            }
            catch (Exception e){
                System.out.println(e);
            }
            d.download();
            this.ddd(d.getme());

            synchronized (down) {
                down.add(d);
            }
        }
    }
}
