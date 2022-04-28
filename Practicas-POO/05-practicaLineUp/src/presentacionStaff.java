public class presentacionStaff extends Thread{
    Screen s;
    @Override
    public void run() {
        Staff st=new Staff();
        st.iniciando(s);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void pantala(Screen s){
        this.s=s;
    }
}
