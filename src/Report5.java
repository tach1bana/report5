


public class Report5 {
    public static void main(String[] args){
        String str = null;
        try{
            if(str != null) {
                System.out.println(str.length());
            }else{
                throw new NullPointerException();
            }
        }catch(NullPointerException e){
            System.out.println("NullPointerException Error が発生しました。");
            System.out.println(e.getMessage());

        }
    }

}
