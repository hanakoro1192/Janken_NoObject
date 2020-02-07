//オブジェクト指向を用いない場合のじゃんけんプログラム

public class SampleJanken{

    //じゃんけんの手を出す定数
    public static final int STONE = 0; //グー
    public static final int SCISSORS = 0; //チョキ
    public static final int PARTTER = 0; //パー

    /*
    プログラムのスタートはここから
    */

    public static void main(String[] args){

        //プレイヤー１の勝数
        int player1WinCount = 0;

        //プレイヤー２の勝数
        int player2WinCount = 0;

        //プレイヤー1が出す手
        int player1Hand = 0;

        //プレイヤー2が出す手
        int player2Hand = 0;

        //じゃんけんの手を決めるのに使用する乱数
        double randomNum = 0;

        /* ①プログラムが開始した事を表示する */
        //プログラム開始メッセージを表示する
        System.out.println("[ジャンケン開始]¥n");

        //ジャンケンを３回開始する

        //⑥勝負した回数を加算する
        //3回勝負し終わったのか
        for (int cnt = 0; cnt < 3; cnt++){
            //何回戦目かを表示する
            System.out.println("[" + (cnt + 1) + "回戦目] ");

            //②プレイヤー1が何を出すのかを決める
            //0.0以上3.0未満の少数として乱数を決める
            randomNum = Math.random() * 3;

            if (randomNum < 1 ){
                //randomNumが0.0以上1.0未満の場合、グー
                player1Hand = STONE;

                //プレイヤー１の手を表示する
                System.out.println("グー");
            }else if(randomNum < 2){
                //randomNumが1.0以上2.0未満の場合、チョキ
                player1Hand = SCISSORS;

                //プレイヤー１の手を表示する
                System.out.println("チョキ");
            }else if(randomNum < 3){
                //randomNumが2.0以上3.0未満の場合,パー
                player1Hand = PARTTER;

                //プレイヤー１の手を表示する
                System.out.println("パー");
            } 

            System.out.println(" vs. ");

            /* ③プレイヤー２が何を出すのかを決める */
            randomNum = Math.random() * 3;

            if(randomNum < 1){
                //randomNumが0.0以上1.0未満の場合、グー
                player2Hand = STONE;

                //プレイヤー2の手を表示する
                System.out.println("グー");
            }else if(randomNum < 2){

                //randomNumが1.0以上2.0未満の場合、チョキ
                player2Hand = SCISSORS;

                //プレイヤー2の手を表示する
                System.out.println("チョキ");
            }else if(randomNum < 3){

                //randomNumが2.0以上3.0未満の場合、パー
                player2Hand = PARTTER;

                //プレイヤー３の手を表示する
                System.out.println("パー");
            }

            /* ④どちらかが価値を判断し、結果を表示する */

            //プレイヤー１が勝つ場合
            if((player1Hand == STONE && player2Hand == SCISSORS) || (player1Hand == SCISSORS && player2Hand == PARTTER) || (player1Hand == PARTTER && player2Hand == STONE)){
                //ジャンケンの結果を表示する
                System.out.println("¥nプレイヤー１が勝ちました.!¥n");

                /* ⑤プレイヤー１の買った回数を加算する */
                player1WinCount++;
            }

            //プレイヤー２が勝つ場合
            else if((player1Hand == STONE && player2Hand == PARTTER) || (player1Hand == SCISSORS && player2Hand == STONE) || (player1Hand == PARTTER && player2Hand == SCISSORS)){
                //ジャンケンの結果を表示する
                System.out.println("¥nプレイヤー2が勝ちました.!¥n");

                /* ⑤プレイヤー2の買った回数を加算する */
                player2Hand++;
            }
            //引き分けの場合
            else{
                //ジャンケンの結果を表示する
                System.out.println("¥n引き分けです!¥n");
            }
        }

        //⑧最終的な勝者を判定し、画面に表示する
        System.out.println("[ジャンケン終了]¥n");

        //プレイヤー１の勝ち数が多いとき
        if(player1WinCount > player2WinCount){
            //プレイヤー１の勝ちを表示する
            System.out.println(player1WinCount + "対" + player2WinCount + "プレイヤー１の勝ちです!¥n");
        }
            //プレイヤー２の勝ち数が多いとき
        else if(player1WinCount < player2WinCount){
            //プレイヤー2の勝ちを表示する
            System.out.println(player1WinCount + "対" + player2WinCount + "プレイヤー2の勝ちです!¥n");
        }
            //プレイヤー１とプレイヤー２の勝ち数が同じ時
        else if(player1WinCount == player2WinCount){
            //引き分けを表示する
            System.out.println(player1WinCount + "対" + player2WinCount + "引き分けです!¥n");
        }
    }
}

/* public class Test{
    public static void main(stirng[] args){
        System.out.println("hello");
    }
} */