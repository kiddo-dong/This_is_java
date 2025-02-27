package ch08.sec05.gpt2;

public class HybridCar implements ElectricVehicle, GasVehicle{

	@Override
	public void fillGas() {
		System.out.println("연료를 채웁니다.");
		
	}

	@Override
	public void chargeBettery() {
		System.out.println("배터리를 충전합니다.");
	}
	
}
