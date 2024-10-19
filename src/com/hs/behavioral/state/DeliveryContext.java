package com.hs.behavioral.state;

public class DeliveryContext {
	private PackageState nextState;
	private String packageId;

	public DeliveryContext(PackageState nextState, String packageId) {
		if (nextState == null) {
			this.nextState = Acknowledged.instance();
		}
		this.packageId = packageId;
	}

	public PackageState getNextState() {
		return nextState;
	}

	public void setNextState(PackageState nextState) {
		this.nextState = nextState;
	}

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public void updateState(DeliveryContext ctx) {
		nextState.updateState(ctx);
	}
}