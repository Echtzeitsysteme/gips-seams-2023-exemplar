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

public class ConnectionDataImpl extends SmartObject implements LectureStudioModel.ConnectionData {

    protected java.lang.String serverId = null;
    protected java.lang.String clientId = null;
    protected double bandwidth = 0.0;
	
	protected ConnectionDataImpl() {
		super(LectureStudioModelPackage.Literals.CONNECTION_DATA);
	}
	
    
    @Override
    public java.lang.String getServerId() {
    	return this.serverId;
    }
    
    @Override
    public void setServerId(java.lang.String value) {
    	Object oldValue = this.serverId;
    	this.serverId = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.CONNECTION_DATA__SERVER_ID, oldValue, value, -1));
    }
    
    
    @Override
    public java.lang.String getClientId() {
    	return this.clientId;
    }
    
    @Override
    public void setClientId(java.lang.String value) {
    	Object oldValue = this.clientId;
    	this.clientId = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.CONNECTION_DATA__CLIENT_ID, oldValue, value, -1));
    }
    
    
    @Override
    public double getBandwidth() {
    	return this.bandwidth;
    }
    
    @Override
    public void setBandwidth(double value) {
    	Object oldValue = this.bandwidth;
    	this.bandwidth = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.CONNECTION_DATA__BANDWIDTH, oldValue, value, -1));
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (LectureStudioModelPackage.Literals.CONNECTION_DATA__SERVER_ID.equals(eFeature)) {
    		setServerId((java.lang.String) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.CONNECTION_DATA__CLIENT_ID.equals(eFeature)) {
    		setClientId((java.lang.String) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.CONNECTION_DATA__BANDWIDTH.equals(eFeature)) {
    		setBandwidth((double) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (LectureStudioModelPackage.Literals.CONNECTION_DATA__SERVER_ID.equals(eFeature)) {
    		setServerId((java.lang.String)null); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.CONNECTION_DATA__CLIENT_ID.equals(eFeature)) {
    		setClientId((java.lang.String)null); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.CONNECTION_DATA__BANDWIDTH.equals(eFeature)) {
    		setBandwidth((double)0.0); 
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
			b.append("serverId: ");
			b.append(getServerId());
		} else {
			b.append("serverId: ");
			b.append(getServerId());b.append(", ");
			b.append("clientId: ");
			b.append(getClientId());
		}
		b.append(")");
		return b.toString();
    }

 	@Override
    public Object eGet(EStructuralFeature eFeature){
    	if (LectureStudioModelPackage.Literals.CONNECTION_DATA__SERVER_ID.equals(eFeature))
    		return getServerId();
    	if (LectureStudioModelPackage.Literals.CONNECTION_DATA__CLIENT_ID.equals(eFeature))
    		return getClientId();
    	if (LectureStudioModelPackage.Literals.CONNECTION_DATA__BANDWIDTH.equals(eFeature))
    		return getBandwidth();
    	return eDynamicGet(eFeature);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType){
    	throw new UnsupportedOperationException("This method has been deactivated since it is not always safe to use.");
    }
    
    @Override
    public void eInverseAdd(Object otherEnd, EStructuralFeature feature) {
	    if(feature == null)
	    	return;
	    	
    	eDynamicInverseAdd(otherEnd, feature);
	    	}
    	
    @Override
	    	public void eInverseRemove(Object otherEnd, EStructuralFeature feature) {
	    if(feature == null)
	    	return;
	    		    		
    	eDynamicInverseRemove(otherEnd, feature);
	    	}
    
    @Override
    /**
    * This method sets the resource and generates REMOVING_ADAPTER and ADD notifications
    */
    protected void setResourceOfContainments(Consumer<SmartObject> setResourceCall) {
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
	    	}
}
