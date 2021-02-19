/*
 Java_teamProject1
 -if,for,배열등을 이용한 게시판 구현-
 2021-02-18   조운호
 */

package teamProject1;
import java.util.Scanner;
public class Board {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int boardNum=6;
      int boardInformation=6;
      String[][] boardArray = new String[boardNum][boardInformation];
      
      int num=0;
      String title;
      String content;
      String author;
      String pwd;
      
      String selectNo;
      boolean run=true;
      
      Scanner sc=new Scanner(System.in);
      while(run) {
         System.out.println("--------------------------------------------------------------------------------------");
         System.out.println("1.목록| 2.생성(Create) | 3.읽기(Read) |"
               + " 4.수정(Update) | 5.삭제(Delete) | 6.종료");
         System.out.println("--------------------------------------------------------------------------------------");
         System.out.print("메뉴선택: ");
         
         selectNo=sc.nextLine();
         
         //1.Select
         if(selectNo.equals("1")) {
        	System.out.print("1.번호순\t 2.조회수순>>");
        	String order=sc.nextLine();
        	
        	if(order.equals("1")) {
                //내림차순 정렬
                for(int i=0;i<boardNum;i++) {
                   for(int j=i+1;j<boardNum;j++) {
                      if((boardArray[i][0]==null)||(boardArray[j][0]==null)) {
                         continue;
                      }
                      int m=Integer.parseInt(boardArray[i][0]);
                      int n=Integer.parseInt(boardArray[j][0]);   
                      if(m<n) {
                         String[] temp=boardArray[i];
                         boardArray[i]=boardArray[j];
                         boardArray[j]=temp;
                      }   
                   }
                }     
             }
        	else if(order.equals("2")) {
                for(int i=0;i<boardNum;i++) {
                    for(int j=i+1;j<boardNum;j++) {
                       if((boardArray[i][4]==null)||(boardArray[j][4]==null)) {
                          continue;
                       }
                       int m=Integer.parseInt(boardArray[i][4]);
                       int n=Integer.parseInt(boardArray[j][4]);   
                       if(m<n) {
                          String[] temp=boardArray[i];
                          boardArray[i]=boardArray[j];
                          boardArray[j]=temp;
                       }   
                       else if(m==n) {
                    	   if( Integer.parseInt(boardArray[i][0])<Integer.parseInt(boardArray[j][0])) {
                               String[] temp=boardArray[i];
                               boardArray[i]=boardArray[j];
                               boardArray[j]=temp;
                    	   }
                    	 
                    	
                       }
                    }
                 }     
        	}
        	else {
        		System.out.println("잘못 입력하셨습니다.");
        		continue;
        	}
            //출력
            System.out.println("번호\t제목\t내용\t글쓴이\t조회수");
            for(int i=0;i<boardNum;i++) {
               if(boardArray[i][0]!=null) {
                  for(String array:boardArray[i]) {
                     System.out.print(array+"\t");
                  }
                  System.out.println();
               }
        	}
        	

            
      }
         //2.Create
         else if(selectNo.equals("2")) {

            System.out.print("제목:");
            title=sc.nextLine();
            System.out.print("내용:");
            content=sc.nextLine();
            System.out.print("글쓴이:");
            author=sc.nextLine();
            System.out.print("비밀번호:");
            pwd=sc.nextLine();
            
            boolean full=true;
            for(int i=0;i<boardNum;i++) {
               if(boardArray[i][0]==null) {
                  boardArray[i][0]=Integer.toString(++num);
                  boardArray[i][1]=title;
                  boardArray[i][2]=content;
                  boardArray[i][3]=author;
                  boardArray[i][4]="0";
                  boardArray[i][5]=pwd;
                  full=false;
                  break;
               }
            }
            
            if(full==true) {
               System.out.println("게시판이 꽉찼습니다.");
            }
            

            
         }
         //3.Read
         else if(selectNo.equals("3")) {
            int no;
            System.out.print("번호: ");
            
            no = Integer.parseInt(sc.nextLine());
            
           
     
            int i;
            
            for(i=0;i<boardNum;i++) {
               if(boardArray[i][0]==null) {
                  continue;
               }
               if(no==Integer.parseInt(boardArray[i][0])) {
                  break;
               }
            }
            
            if(i>=boardNum) {
               System.out.println("잘못 입력하셨습니다.");
            }
            
            else {
               int views=Integer.parseInt(boardArray[i][4]);
               views++;
               boardArray[i][4]= Integer.toString(views);
               System.out.println("제목:"+boardArray[i][1]);
               System.out.println("내용:"+boardArray[i][2]);
               System.out.println("글쓴이:"+boardArray[i][3]);
               System.out.println("조회수:"+boardArray[i][4]);
               System.out.println();
            }
            
         }
         //4.Update
         else if(selectNo.equals("4")) {
                        
            System.out.print("번호: ");
            String no=sc.nextLine();
            System.out.print("비밀번호: ");
            pwd=sc.nextLine();
            int i;
            for(i=0;i<boardNum;i++) {
               if(boardArray[i][0]==null) {
                  continue;
               }
               if(no.equals(boardArray[i][0])) {
                  break;
               }
            }
            if(i>=boardNum) {
               System.out.println("없는 게시판입니다.");  
               selectNo="0";
            }
            else if(pwd.equals(boardArray[i][5])==false){
               System.out.println("비밀번호가 틀렸습니다.");  
               selectNo="0";
            }
            else {
               System.out.println("기존제목: "+boardArray[i][1]);
               System.out.print("수정제목: ");
               String modifytitle=sc.nextLine();
               if(!modifytitle.equals("")) {
                  boardArray[i][1]=modifytitle;
               }
               
               System.out.println("기존내용: "+boardArray[i][2]);
               System.out.print("수정내용: ");
               String modifycontent=sc.nextLine();
               if(!modifycontent.equals("")) {
                  boardArray[i][2]=modifycontent;
               }
            }
                        
            //자동으로 목록으로 이동
            
         }
         //5.Delete
         else if(selectNo.equals("5")) {
            System.out.print("번호: ");
            String no=sc.nextLine();
            System.out.print("비밀번호: ");
            pwd=sc.nextLine();
            int i;
            for(i=0;i<boardNum;i++) {
               if(boardArray[i][0]==null) {
                  continue;
               }
               if(no.equals(boardArray[i][0])) {
                  break;
               }
            }
            
            for(int j=0;j<boardInformation;j++) {
               if(i>=boardNum) {
                  System.out.println("없는 게시판입니다.");    
                  selectNo="0";
                  break;
               }
               else if(pwd.equals(boardArray[i][5])==false) {
                  System.out.println("비밀번호가 틀렸습니다.");    
                  selectNo="0";
                  break;
               }
               boardArray[i][j]=null;
            }
            
            //자동으로 목록으로 이동
         }
         //6.Exit
         else if(selectNo.equals("6")) {
            run=false;
            System.out.println("프로그램 종료");
         }
         else {
            System.out.println("잘못 입력하셨습니다.");
         }
         
         //목록 출력
         if(selectNo.equals("2")||selectNo.equals("4")||selectNo.equals("5")) {
            System.out.println("번호\t제목\t내용\t글쓴이\t조회수");
            
            //내림차순 정렬
            for(int i=0;i<boardNum;i++) {
               for(int j=i+1;j<boardNum;j++) {
                  if((boardArray[i][0]==null)||(boardArray[j][0]==null)) {
                     continue;
                  }
                  int m=Integer.parseInt(boardArray[i][0]);
                  int n=Integer.parseInt(boardArray[j][0]);   
                  if(m<n) {
                     String[] temp=boardArray[i];
                     boardArray[i]=boardArray[j];
                     boardArray[j]=temp;
                  }   
               }
            }
            //출력
            for(int i=0;i<boardNum;i++) {
               if(boardArray[i][0]!=null) {
                  for(String array:boardArray[i]) {
                     System.out.print(array+"\t");
                  }
                  System.out.println();
               }
                  
         }
         }
         
      }
      
   }

}