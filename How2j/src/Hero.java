/**
 * @program JavaBooks
 * @description: 创建英雄类
 * @author: mf
 * @create: 2019/04/01 09:44
 */

public class Hero {

    // 类的属性
    String name; // 名字
    float hp; // 血量
    float armor; // 护甲
    int moveSpeed; // 移动速度


    // 定义一个方法 坑队友
    void keng() {
        System.out.println("坑队友");
    }
    // 获取护甲值
    float getArmor() {
        return armor;
    }
    // 增加移动速度
    void addSpeed(int speed) {
        moveSpeed = moveSpeed + speed;
    }
    // 超神
    void legendary() {
        System.out.println("超神");
    }

    // 获取当前的血量

    float getHp() {
        return hp;
    }
    // 回血

    void recovery(float blood) {
        hp = hp + blood;
    }

    public static void main(String[] args) {
        // 创建英雄对象

        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 35;

        // 给garen增加100的移动速度
        garen.addSpeed(100);

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;


        // 创建物品对象
        Item bloodBottle = new Item();
        bloodBottle.name = "血瓶";
        bloodBottle.price = 50;

        Item sandlas = new Item();
        sandlas.name = "草鞋";
        sandlas.price = 300;

        Item longSword = new Item();
        longSword.name = "长剑";
        longSword.price = 350;

    }
}


class Item {
    String name; // 名字
    int price; // 价格
}
