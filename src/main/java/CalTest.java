import static org.easymock.EasyMock.aryEq;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.expectLastCall;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

import junit.framework.TestCase;
	
public class CalTest extends TestCase{
	CalIF mock;
	CalMain mMock;
	
	protected void setUp() throws Exception{
		mock = createMock(CalIF.class);
		mMock = new CalMain();
		mMock.setCal(mock);
		super.setUp();
	}
	public void testDoAdd() {
		expect(mock.add(10, 20)).andReturn(30).times(2);
		replay(mock);
		this.assertEquals(30, mMock.doAdd(10, 20));
		verify(mock);
	}
	public void testDoSubstract() {
		expect(mock.add(20, 10)).andReturn(10).times(2);
		replay(mock);
		this.assertEquals(10, mMock.doAdd(20, 10));
		verify(mock);
	}
}
