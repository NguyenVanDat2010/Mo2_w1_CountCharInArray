import java.util.Scanner;
public class CountCharInArray {
    public int CountChar(String str, char kyTu){
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==kyTu){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi của bạn: ");
        String strA=scanner.nextLine();
//        String strA="i love you";
        System.out.print("Nhập ký tự bạn muốn tìm: ");
        char kyTu=scanner.next().charAt(0);
//        char kyTu= 'o';
        CountCharInArray lopMain=new CountCharInArray();
        System.out.print("Số ký tự "+kyTu+" có trong chuỗi của bạn là: "+lopMain.CountChar(strA,kyTu));
    }
}
