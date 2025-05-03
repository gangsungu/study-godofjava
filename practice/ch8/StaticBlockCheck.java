public class StaticBlockCheck {
    public static void main(String[] args) {
        StaticBlockCheck check = new StaticBlockCheck();
        // check.makeStaticBlockObject();
        check.makeStaticBlockObjectWithData();
    }

    public void makeStaticBlockObject() {
        System.out.println("Creating Block1");
        StaticBlock block1 = new StaticBlock();
        System.out.println("Created Block1");
        System.out.println("--------------");
        StaticBlock block2 = new StaticBlock();
        System.out.println("Creating Block2");
        System.out.println("Created Block2");
    }

    public void makeStaticBlockObjectWithData() {
        System.out.println("data="+StaticBlock.getData());
        StaticBlock block1 = new StaticBlock();
        block1.data = 1;
        System.out.println("-------------------------");
        StaticBlock block2 = new StaticBlock();
        block2.data = 2;
        System.out.println("data = " + StaticBlock.getData());
    }
}

// Creating Block1
// *** First static block. ***
// *** Second static block. ***
// StaticBlock Constructor
// Created Block1
// --------------
// StaticBlock Constructor
// Creating Block2
// Created Block2

// *** First static block. ***
// *** Second static block. ***
// data=5
// StaticBlock Constructor
// -------------------------
// StaticBlock Constructor
// data = 2