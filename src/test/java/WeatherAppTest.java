
 import static org.easymock.EasyMock.aryEq;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.expectLastCall;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

import junit.framework.TestCase;


public class WeatherAppTest extends TestCase{
	
	WeatherData dataMock;
	WeatherApp appMock;

	protected void setUp() throws Exception{
		dataMock = createMock(WeatherData.class);
		appMock = new WeatherApp();
		appMock.setWeather(dataMock);
		super.setUp();
	}

	public void testcompareTemperature1() {
		expect(dataMock.getTemperature()).andReturn(30);
		replay(dataMock);
		this.assertEquals(10, appMock.compareTemperature(20));
		verify(dataMock);
	}
	public void testcompareTemperature2() {
		expect(dataMock.getTemperature()).andReturn(30);
		replay(dataMock);
		this.assertEquals(0, appMock.compareTemperature(30));
		verify(dataMock);
	}
	public void testcompareTemperature3() {
		expect(dataMock.getTemperature()).andReturn(30);
		replay(dataMock);
		this.assertEquals(10, appMock.compareTemperature(40));
		verify(dataMock);
	}

	public void testcompareHumidity1() {
		expect(dataMock.getHumidity()).andReturn(20);
		replay(dataMock);
		this.assertEquals(120, appMock.compareHumidity(10));
		verify(dataMock);
	}
	public void testcompareHumidity2() {
		expect(dataMock.getHumidity()).andReturn(20);
		replay(dataMock);
		this.assertEquals(0, appMock.compareHumidity(20));
		verify(dataMock);
	}
	public void testcompareHumidity3() {
		expect(dataMock.getHumidity()).andReturn(20);
		replay(dataMock);
		this.assertEquals(10, appMock.compareHumidity(30));
		verify(dataMock);
	}
}


