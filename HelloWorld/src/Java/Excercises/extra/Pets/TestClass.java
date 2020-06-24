public class TestClass {
    public int foo;

    public TestClass(int foo) {
        this.foo = foo;
    }

    public int getFoo() {
        return foo;
    }       
}




List<TestClass> testList = new ArrayList<TestClass>();
testList.add(new TestClass(1));
testList.add(new TestClass(2));
testList.add(new TestClass(3));

Iterator<TestClass> it = tickScratch.iterator();
while(it.hasNext()) {
    if(((TestClass)it).getFoo() == 2)
        it.remove();
}