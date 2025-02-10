package text.kadai_015;
// 車クラス
public class CarExec_Chapter15 {
	// フィールド（内部データ）
    private int gear  = 1;  // 1速から5速のギアを表す
    private int speed = 10; // ギアチェンジ後の速度を表す 
    
    // コンストラクタ（初期化処理）
    public CarExec_Chapter15( int gear, int speed) {
        this.gear  = gear;
        this.speed = speed;
    }

    // 【メソッド】ギア数を更新してギアと速度を表示する
    // afterGear：切り替え後のギア

    public void gearChange( final int afterGear ) {
        System.out.println("ギア" + this.gear + "から" 
                       + afterGear + "に切り替えました");
        
        run(afterGear);
    	}
    
        public void run(final int afterGear) {

          switch (afterGear) {
     	    case 1  -> System.out.println("速度は時速" + this.speed*afterGear + "kmです" );
     	    case 2  -> System.out.println("速度は時速" + this.speed*afterGear + "kmです" );
     	    case 3  -> System.out.println("速度は時速" + this.speed*afterGear + "kmです"  );
     	    case 4  -> System.out.println("速度は時速" + this.speed*afterGear + "kmです" );
     	    case 5  -> System.out.println("速度は時速" + this.speed*afterGear + "kmです" );
     	    default -> System.out.println("速度は時速" + this.speed + "kmです");
     	} 
     }    	
 }




