public class MemberServiceImpl implements MemberService {

    private static MemberServiceImpl singleton = new MemberServiceImpl();

    private MemberServiceImpl() {};

    public static MemberServiceImpl getInstance() {
        return singleton;
    }

    @Override
    public String greet(int i) {
        String[] greetings = {"Good Morning", "Hello", "Good Evening"};
        retrun greetings[i];
    }

    @Override
    public ArrayList<Member> getAll() {
        ArrayList<Member> list new ArrayList<>();
        Member mem1 = new Member(1, "Linda", "linda@example.com");
        Member mem2 = new Member(2, "James", "james@example.com");
        list.add(mem1);
        list.add(mem2);
        return list;
    }

    @Override
    public int sumOf(int x, int y) {
        int sum = 0;
        for (int i = x; i<=y; i++) {
            sum += 1;
        }
        return sum;
    }
}