public class Exam3  {

    public static void main(String[] args) {

        청둥오리 a청둥오리 = new 청둥오리(); // 청둥오리가 만들어집니다. 청둥오리는 기본 날개를 가지고 태어납니다.

        a청둥오리.날다(); // 청둥오리가 날개로 천천히 날아갑니다.

        흰오리 a흰오리 = new 흰오리(); // 흰오리가 만들어집니다. 흰오리는 불사조 날개를 가지고 태어납니다.

        a흰오리.날다(); // 흰오리가 불사조 날개로 불타오르며 날아갑니다.

        붉은오리 a붉은오리 = new 붉은오리(); // 붉은오리가 만들어집니다. 붉은오리는 로켓 날개를 가지고 태어납니다.

        a붉은오리 .날다(); // 붉은오리가 로켓날개로 놀라운 속도로 굉음을 내며 날아갑니다

    }
}


class 청둥오리 {

    String name1 = "청둥오리";
    날개종류 wing = new 날개종류();
    비행방법 fly = new 비행방법();

    청둥오리 () {
        System.out.printf("%s가 만들어집니다.", name1);
        System.out.printf("%s는 ", name1);
        wing.기본날개();
    }

    public void 날다 () {
        System.out.printf("%s가 ",name1);
        fly.기본비행();
    }
}

class 흰오리 {

    String name2 = "흰오리";
    날개종류 wing = new 날개종류();
    비행방법 fly = new 비행방법();
    흰오리 () {
        System.out.printf("%s가 만들어집니다.", name2);
        System.out.printf("%s는 ", name2);
        wing.불사조날개();
    }

    public void 날다 () {
        System.out.printf("%s가 ",name2);
        fly.불사조비행();
    }
}

class 붉은오리 {

    String name3 = "붉은오리";
    날개종류 wing = new 날개종류();
    비행방법 fly = new 비행방법();

    붉은오리 ()  {
        System.out.printf("%s가 만들어집니다.", name3);
        System.out.printf("%s는 ", name3);
        wing.로켓날개();
    }

    public void 날다 () {
        System.out.printf("%s가 ",name3);
        fly.로켓비행();
    }
}

class 날개종류 {
    public void 기본날개() {
        System.out.println("기본 날개를 가지고 태어납니다");
    }

    public void 불사조날개() {
        System.out.println("불사조 날개를 가지고 태어납니다");
    }

    public void 로켓날개() {
        System.out.println("로켓 날개를 가지고 태어납니다");
    }
}

class 비행방법 {

    public void 기본비행() {
        System.out.println("날개로 천천히 날아갑니다.");
    }

    public void 불사조비행() {
        System.out.println("불사조 날개로 불타오르며 날아갑니다.");
    }

    public void 로켓비행() {
        System.out.println("로켓날개로 놀라운 속도로 굉음을 내며 날아갑니다");
    }

}