package LectureStudioModel.impl;

import LectureStudioModel.LectureStudioModelPackage;
import LectureStudioModel.LectureStudioModelPackage;

import org.emoflon.smartemf.runtime.*;
import org.emoflon.smartemf.runtime.collections.*;
import org.emoflon.smartemf.persistence.SmartEMFResource;
import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.notification.NotifyStatus;

import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public class NodeImpl extends SmartObject implements LectureStudioModel.Node {

    protected double sendBandwidth = 0.0;
    protected double receiveBandwidth = 0.0;
    protected LectureStudioModel.Data data = null;
    protected LectureStudioModel.Connection serverConnection = null;
    protected LinkedSmartESet<LectureStudioModel.Connection> clientConnection = new LinkedSmartESet<LectureStudioModel.Connection>(this, LectureStudioModelPackage.Literals.NODE__CLIENT_CONNECTION);
    protected java.lang.String id = null;
    protected boolean isRelayClient = false;
    protected double clock = 0.0;
    protected double transferredData = 0.0;
	
	protected NodeImpl() {
		super(LectureStudioModelPackage.Literals.NODE);
	}
	
    
    @Override
    public double getSendBandwidth() {
    	return this.sendBandwidth;
    }
    
    @Override
    public void setSendBandwidth(double value) {
    	Object oldValue = this.sendBandwidth;
    	this.sendBandwidth = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.NODE__SEND_BANDWIDTH, oldValue, value, -1));
    }
    
    
    @Override
    public double getReceiveBandwidth() {
    	return this.receiveBandwidth;
    }
    
    @Override
    public void setReceiveBandwidth(double value) {
    	Object oldValue = this.receiveBandwidth;
    	this.receiveBandwidth = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.NODE__RECEIVE_BANDWIDTH, oldValue, value, -1));
    }
    
    
    @Override
    public LectureStudioModel.Data getData() {
    	return this.data;
    }
    
    @Override
    public void setData(LectureStudioModel.Data value) {
    	
    	Object oldValue = this.data;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	Resource.Internal resource = (Resource.Internal) eResource();
    		        if(oldValue != null && value != null) {
    		        	setResourceWithoutChecks(null);
    		        }
    		        
    		        NotifyStatus status = NotifyStatus.SUCCESS_NO_NOTIFICATION;
    	if(oldValue != null) {
    	        		status = ((MinimalSObjectContainer) oldValue).resetContainment();
    	}	
    	
    		        this.data = value;
    	
    	
    	if(value != null)
    		status = ((MinimalSObjectContainer) this.data).setContainment(this, LectureStudioModelPackage.Literals.NODE__DATA);
    	
    			 	if(oldValue != null && value != null) {
    		        	setResourceWithoutChecks(resource);
    		        }
    	
    	if(status == NotifyStatus.SUCCESS_NO_NOTIFICATION || oldValue != null && value != null)
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.NODE__DATA, oldValue, value, -1));
    	        	
    	        	if(LectureStudioModelPackage.Literals.NODE__DATA.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, LectureStudioModelPackage.Literals.NODE__DATA.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, LectureStudioModelPackage.Literals.NODE__DATA.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public LectureStudioModel.Connection getServerConnection() {
    	return this.serverConnection;
    }
    
    @Override
    public void setServerConnection(LectureStudioModel.Connection value) {
    	
    	Object oldValue = this.serverConnection;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.serverConnection = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.NODE__SERVER_CONNECTION, oldValue, value, -1));
    	        	
    	
    	        	if(oldValue != null) {
    	        		((SmartObject) oldValue).eInverseRemove(this, LectureStudioModelPackage.Literals.CONNECTION__CLIENT);
    	        	}
    	        	if(value != null) {
    	        		((SmartObject) value).eInverseAdd(this, LectureStudioModelPackage.Literals.CONNECTION__CLIENT);
    	        	}
    }
    
    private void setServerConnectionAsInverse(LectureStudioModel.Connection value) {
			    
			    Object oldValue = this.serverConnection;
			    
			    if(value == null && oldValue == null)
			    	return;
			    	
			    if(value != null && value.equals(oldValue))
			    	return;
			    	
			    
			    
			    	        this.serverConnection = value;
			    
			    
			            	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.NODE__SERVER_CONNECTION, oldValue, value, -1));
			            	
    }
    
    @Override
    public LinkedSmartESet<LectureStudioModel.Connection> getClientConnection() {
    	return this.clientConnection;
    }
    
    @Override
    public void setClientConnection(LinkedSmartESet<LectureStudioModel.Connection> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    
    private void addClientConnectionAsInverse(LectureStudioModel.Connection value) {
    	if(this.clientConnection.addInternal(value, false) == NotifyStatus.SUCCESS_NO_NOTIFICATION) {
    sendNotification(SmartEMFNotification.createAddNotification(this, LectureStudioModelPackage.Literals.NODE__CLIENT_CONNECTION, value, -1));
    	} 
    }
    
    private void removeClientConnectionAsInverse(LectureStudioModel.Connection value) {
    	clientConnection.removeInternal(value, false, true);
    }
    
    @Override
    public java.lang.String getId() {
    	return this.id;
    }
    
    @Override
    public void setId(java.lang.String value) {
    	Object oldValue = this.id;
    	this.id = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.NODE__ID, oldValue, value, -1));
    }
    
    
    @Override
    public boolean isIsRelayClient() {
    	return this.isRelayClient;
    }
    
    @Override
    public void setIsRelayClient(boolean value) {
    	Object oldValue = this.isRelayClient;
    	this.isRelayClient = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.NODE__IS_RELAY_CLIENT, oldValue, value, -1));
    }
    
    
    @Override
    public double getClock() {
    	return this.clock;
    }
    
    @Override
    public void setClock(double value) {
    	Object oldValue = this.clock;
    	this.clock = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.NODE__CLOCK, oldValue, value, -1));
    }
    
    
    @Override
    public double getTransferredData() {
    	return this.transferredData;
    }
    
    @Override
    public void setTransferredData(double value) {
    	Object oldValue = this.transferredData;
    	this.transferredData = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.NODE__TRANSFERRED_DATA, oldValue, value, -1));
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (LectureStudioModelPackage.Literals.NODE__SEND_BANDWIDTH.equals(eFeature)) {
    		setSendBandwidth((double) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.NODE__RECEIVE_BANDWIDTH.equals(eFeature)) {
    		setReceiveBandwidth((double) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.NODE__DATA.equals(eFeature)) {
    		setData((LectureStudioModel.Data) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.NODE__SERVER_CONNECTION.equals(eFeature)) {
    		setServerConnection((LectureStudioModel.Connection) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.NODE__CLIENT_CONNECTION.equals(eFeature)) {
    		setClientConnection((LinkedSmartESet<LectureStudioModel.Connection>) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.NODE__ID.equals(eFeature)) {
    		setId((java.lang.String) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.NODE__IS_RELAY_CLIENT.equals(eFeature)) {
    		setIsRelayClient((boolean) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.NODE__CLOCK.equals(eFeature)) {
    		setClock((double) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.NODE__TRANSFERRED_DATA.equals(eFeature)) {
    		setTransferredData((double) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (LectureStudioModelPackage.Literals.NODE__SEND_BANDWIDTH.equals(eFeature)) {
    		setSendBandwidth((double)0.0); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.NODE__RECEIVE_BANDWIDTH.equals(eFeature)) {
    		setReceiveBandwidth((double)0.0); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.NODE__DATA.equals(eFeature)) {
    		setData((LectureStudioModel.Data)null); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.NODE__SERVER_CONNECTION.equals(eFeature)) {
    		setServerConnection((LectureStudioModel.Connection)null); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.NODE__CLIENT_CONNECTION.equals(eFeature)) {
    		getClientConnection().clear(); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.NODE__ID.equals(eFeature)) {
    		setId((java.lang.String)null); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.NODE__IS_RELAY_CLIENT.equals(eFeature)) {
    		setIsRelayClient((boolean)false); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.NODE__CLOCK.equals(eFeature)) {
    		setClock((double)0.0); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.NODE__TRANSFERRED_DATA.equals(eFeature)) {
    		setTransferredData((double)0.0); 
    		return;
    	}
    	eDynamicUnset(eFeature);
    }

    @Override
    public String toString(){
		StringBuilder b = new StringBuilder();
		b.append(super.toString());
		b.append(" (");
		if (SmartEMFConfig.simpleStringRepresentations()) {
			b.append("isRelayClient: ");
			b.append(isIsRelayClient());
		} else {
			b.append("isRelayClient: ");
			b.append(isIsRelayClient());
		}
		b.append(")");
		return b.toString();
    }

 	@Override
    public Object eGet(EStructuralFeature eFeature){
    	if (LectureStudioModelPackage.Literals.NODE__SEND_BANDWIDTH.equals(eFeature))
    		return getSendBandwidth();
    	if (LectureStudioModelPackage.Literals.NODE__RECEIVE_BANDWIDTH.equals(eFeature))
    		return getReceiveBandwidth();
    	if (LectureStudioModelPackage.Literals.NODE__DATA.equals(eFeature))
    		return getData();
    	if (LectureStudioModelPackage.Literals.NODE__SERVER_CONNECTION.equals(eFeature))
    		return getServerConnection();
    	if (LectureStudioModelPackage.Literals.NODE__CLIENT_CONNECTION.equals(eFeature))
    		return getClientConnection();
    	if (LectureStudioModelPackage.Literals.NODE__ID.equals(eFeature))
    		return getId();
    	if (LectureStudioModelPackage.Literals.NODE__IS_RELAY_CLIENT.equals(eFeature))
    		return isIsRelayClient();
    	if (LectureStudioModelPackage.Literals.NODE__CLOCK.equals(eFeature))
    		return getClock();
    	if (LectureStudioModelPackage.Literals.NODE__TRANSFERRED_DATA.equals(eFeature))
    		return getTransferredData();
    	return eDynamicGet(eFeature);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType){
    	throw new UnsupportedOperationException("This method has been deactivated since it is not always safe to use.");
    }
    
    @Override
    public void eInverseAdd(Object otherEnd, EStructuralFeature feature) {
if (LectureStudioModelPackage.Literals.NODE__SERVER_CONNECTION.equals(feature)) {
setServerConnectionAsInverse((LectureStudioModel.Connection) otherEnd); 
 	return;
			        }	
if (LectureStudioModelPackage.Literals.NODE__CLIENT_CONNECTION.equals(feature)) {
	addClientConnectionAsInverse((LectureStudioModel.Connection) otherEnd);
 	return;
			        }	
	    if(feature == null)
	    	return;
	    	
    	eDynamicInverseAdd(otherEnd, feature);
	    	}
    	
    @Override
	    	public void eInverseRemove(Object otherEnd, EStructuralFeature feature) {
if (LectureStudioModelPackage.Literals.NODE__SERVER_CONNECTION.equals(feature)) {
setServerConnectionAsInverse(null); 
 	return;
			        }
if (LectureStudioModelPackage.Literals.NODE__CLIENT_CONNECTION.equals(feature)) {
	removeClientConnectionAsInverse((LectureStudioModel.Connection) otherEnd);
 	return;
			        }
	    if(feature == null)
	    	return;
	    		    		
    	eDynamicInverseRemove(otherEnd, feature);
	    	}
    
    @Override
    /**
    * This method sets the resource and generates REMOVING_ADAPTER and ADD notifications
    */
    protected void setResourceOfContainments(Consumer<SmartObject> setResourceCall) {
if(getData() != null)
	setResourceCall.accept((SmartObject) getData());
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
if(getData() != null)
    ((SmartObject) getData()).setResourceSilently(r);
	    	}
}
