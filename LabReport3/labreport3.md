![Image](lab4bug.png)
From Lab 4, reverseInPlace method of class ArrayExamples

A failure-inducing input for the buggy program

```
{
    @Test 
	public void testReverseInPlace2() {
        int[] input1 = { 1, 2 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{ 2, 1 }, input1);
	}
}
```

An input that doesn’t induce a failure

```
{
   	@Test 
	public void testReverseInPlace() {
        int[] input1 = { 3 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{ 3 }, input1);
	}
}
```

The symptom, as the output of running the tests
![Image](nofailureinput.png)
![Image](failureinput.png)

The bug, before-and-after code change required to fix it 

Before

```
{
    arr[i] = arr[arr.length() - i - 1];
}
```

After

```
{
    arr[i] = arr[arr.length() - i - 1];
}
```