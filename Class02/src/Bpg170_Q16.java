import java.util.Scanner;

public class Bpg170_Q16 {
    public static void main(String[] args) {
    int iRanNo, iRes;
    String sOptions[] = {"Scissor", "Rock", "Paper", "Stop"};
    String sWinner[] = {"Computer", "User", "No One"};
    String sUserChoice, sComChoice;
    Scanner oInDev;
    
    iRes = -1;
    oInDev = new Scanner (System.in);

    System.out.println("Let's start Rock-Scissor-Paper with Computer.");
    
    
    
    
    while(true){
        System.out.print("Rock-Scissor-Paper >> ");
        sUserChoice = oInDev.nextLine();
        
        //Stop
        if(sUserChoice.equals(sOptions[3])) {
            System.out.println("Game END...");
            break;
        }

        //GAME START
        else{

            iRanNo = (int)(Math.random()*3);
            sComChoice = sOptions[iRanNo];

           if(sUserChoice.equals(sComChoice) || sUserChoice.equals(sComChoice) || sUserChoice.equals(sComChoice)){
                iRes = 2;
            }
            else{
                //사용자가 가위를 냈을 때
                if(sUserChoice.equals(sOptions[0])){
                    // 컴퓨터가 바위를 냈을 때
                    if(sComChoice.equals(sOptions[1])){
                        iRes = 0;
                    }
                    // 컴퓨터가 보를 냈을 때
                    else{
                        iRes = 1;
                     }
                 }
                //사용자가 바위를 냈을 때
                 else if(sUserChoice.equals(sOptions[1])){
                    // 컴퓨터가 가위를 냈을 때
                    if(sComChoice.equals(sOptions[0])){
                         iRes = 1;
                    }
                    // 컴퓨터가 보를 냈을 때
                    else{
                        iRes = 0;
                    }

                }
                //사용자가 보를 냈을 때
                else if(sUserChoice.equals(sOptions[2])){
                    // 컴퓨터가 가위를 냈을 때
                    if(sComChoice.equals(sOptions[0])){
                        iRes = 0;
                    }
                    // 컴퓨터가 바위를 냈을 때
                    else{
                        iRes = 1;
                    }
                }
                //오류
                else{
                    iRes = 2;
                    System.out.println("That is not right option. Let's play again !");
                }
            }

            System.out.println("User = "+sUserChoice+" , Computer = "+sComChoice+ " , "+sWinner[iRes]+ " is WIN");

        }

    }


    oInDev.close();
    }
}
