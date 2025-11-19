abstract class Printer{
    String model;
    int printedCount;
    int availableCount;
    public abstract boolean print();

    Printer(String model, int printedCount){
        this.model = model;
        this.printedCount = printedCount;
    }
}

class InkjetPrinter extends Printer{
    InkjetPrinter(String m, int pc){
        super(m, pc);
    }

    public boolean print(){
        if(availableCount == 0){
            System.out.println(model + ": " + (printedCount+1) + "매째 인쇄 실패 - 잉크 부족.");
            return false;
        }else if(availableCount >= 1){
            printedCount++;
            availableCount--;
            return true;
        }
        return true;
    }
}

class LaserPrinter extends Printer{
    LaserPrinter(String m, int pc){
        super(m, pc);
    }

    public boolean print(){
        if(availableCount == 0){
            System.out.println(model + ": " + (printedCount+1) + "매째 인쇄 실패 - 토너 부족.");
            return false;
        }else if(availableCount >= 1){
            printedCount++;
            availableCount--;
            return true;
        }

        return true;
    }
}
public class Homework7 {
    public static void main(String[] args){
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while(inkjet.print());
        while(laser.print());
    }
}
