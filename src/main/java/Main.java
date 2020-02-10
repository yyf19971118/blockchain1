import pojo.Block;
import pojo.BlockChain;

public class Main {
    public static void main(String[] args){
        /*
        Block block1 = new Block();
        block1.setIndex(0);
        block1.setTimestamp(1578000000000L);
        block1.setHash("000c81784691c7bb8bacab6affb23312fd707bf0463e9afc217ce1a32ab3a4aa");
        block1.setPreviousHash("0");
        block1.setData("GENESIS BLOCK");
        block1.setNonce(1545);

        System.out.println(block1);

        Block block2 = new Block();
        block2.setIndex(1);
        block2.setTimestamp(1578000000000L);
        block2.setHash("000c81784691c7bb8bacab6affb23312fd707bf0463e9afc217ce1a32ab3a4aa");
        block2.setPreviousHash("0");
        block2.setData("GENESIS BLOCK");
        block2.setNonce(1545);

        System.out.println(block2);
        System.out.println(block1.equals(block2));
        System.out.println(block1.equals(null));
        System.out.println(block2.equals(block1));
        System.out.println(block2.equals(null));
        System.out.println(block1.equals(block1));
        System.out.println(block1.equals("abc"));
        */
        //BlockChain bc = new BlockChain();
        //System.out.println(bc);
        /*
        //创建区块链对象
        BlockChain bc = new BlockChain();
        //生成新区块
        Block block = bc.generateNextBlock("hello,blokchain.");
        System.out.println(block);
        //添加新区块
        bc.addBlock(block);
        //打印结果
        System.out.println(bc);
        */
        BlockChain bc1 = new BlockChain();
        bc1.addBlock(bc1.generateNextBlock("1-1"));
        bc1.addBlock(bc1.generateNextBlock("1-2"));
        bc1.addBlock(bc1.generateNextBlock("1-3"));
        bc1.getBlockChain().get(2).setData("2-9");
        BlockChain bc2 = new BlockChain();
        bc2.addBlock(bc2.generateNextBlock("2-1"));
        bc2.addBlock(bc2.generateNextBlock("2-2"));



        System.out.println(bc1);
        System.out.println(bc2);

        System.out.println("执行替换");
        bc2.replaceChain(bc1.getBlockChain());


        System.out.println(bc1);
        System.out.println(bc2);




    }

}
