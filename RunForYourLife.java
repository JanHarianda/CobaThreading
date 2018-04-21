/**
 * Kelas proses threading
 *
 * @author Jan Harianda Barus
 * @version April 21, 2018
 */

public class RunForYourLife implements Runnable {
    private Thread tes;
    private String nama;

    RunForYourLife (String nama){
        this.nama = nama;
        System.out.println(nama+", ready");
    }
  
    public void run(){
        System.out.println(getNama()+", go!" );
        try {
            for(int i = 0; i <=19; i++) {
                // Let the thread sleep for a while.
                Thread.sleep(LetsGo.getRandom(getNama(),i));
                int check=i+1;
                System.out.println(getNama()+" has passed checkpoint "+ check + " With delay "+LetsGo.getRandom(getNama(),i));
            }
        } catch (InterruptedException e) {
            System.out.println(getNama()+" was interupted.");
        }
        System.out.println(getNama()+" has finished");
    }

    public void start () {
        System.out.println(getNama()+", set" );
        if (tes == null) {
            tes = new Thread (this, getNama());
            tes.start ();
        }
    }
    
    public String getNama(){
        return nama;
    }
}
