public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Excalibur");
        Boss boss = new Boss("Evil Boss", 1000, 50, bossWeapon);

        Weapon skeletonWeapon1 = new Weapon(WeaponType.BOW, "Bone Bow");
        Skeleton skeleton1 = new Skeleton("Skeleton Archer 1", 200, 20, skeletonWeapon1, 30);

        Weapon skeletonWeapon2 = new Weapon(WeaponType.AXE, "Bone Axe");
        Skeleton skeleton2 = new Skeleton("Skeleton Warrior 1", 300, 30, skeletonWeapon2, 0);

        System.out.println(boss.printInfo());
        System.out.println("------------------------");
        System.out.println(skeleton1.printInfo());
        System.out.println("------------------------");
        System.out.println(skeleton2.printInfo());
    }
}