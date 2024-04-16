public class zoorunner {
    public static void main(String[] args) throws Exception {
        bear bear = new bear();
        lion lion = new lion();
        sleeptime sleeptime = new sleeptime();
        
        bear.longhuff();
        lion.roar();
        sleeptime.sleep();
        bear.snorebear();
        lion.snorelion();
    }
}