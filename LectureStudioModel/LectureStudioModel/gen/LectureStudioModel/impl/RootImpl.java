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

public class RootImpl extends SmartObject implements LectureStudioModel.Root {

    protected LinkedSmartESet<LectureStudioModel.Network> networks = new LinkedSmartESet<LectureStudioModel.Network>(this, LectureStudioModelPackage.Literals.ROOT__NETWORKS);
    protected double clock = 0.0;
    protected LectureStudioModel.Time time = null;
	
	protected RootImpl() {
		super(LectureStudioModelPackage.Literals.ROOT);
	}
	
    
    @Override
    public LinkedSmartESet<LectureStudioModel.Network> getNetworks() {
    	return this.networks;
    }
    
    @Override
    public void setNetworks(LinkedSmartESet<LectureStudioModel.Network> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    
    
    @Override
    public double getClock() {
    	return this.clock;
    }
    
    @Override
    public void setClock(double value) {
    	Object oldValue = this.clock;
    	this.clock = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.ROOT__CLOCK, oldValue, value, -1));
    }
    
    
    @Override
    public LectureStudioModel.Time getTime() {
    	return this.time;
    }
    
    @Override
    public void setTime(LectureStudioModel.Time value) {
    	
    	Object oldValue = this.time;
    	
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
    	
    		        this.time = value;
    	
    	
    	if(value != null)
    		status = ((MinimalSObjectContainer) this.time).setContainment(this, LectureStudioModelPackage.Literals.ROOT__TIME);
    	
    			 	if(oldValue != null && value != null) {
    		        	setResourceWithoutChecks(resource);
    		        }
    	
    	if(status == NotifyStatus.SUCCESS_NO_NOTIFICATION || oldValue != null && value != null)
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.ROOT__TIME, oldValue, value, -1));
    	        	
    	        	if(LectureStudioModelPackage.Literals.ROOT__TIME.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, LectureStudioModelPackage.Literals.ROOT__TIME.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, LectureStudioModelPackage.Literals.ROOT__TIME.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (LectureStudioModelPackage.Literals.ROOT__NETWORKS.equals(eFeature)) {
    		setNetworks((LinkedSmartESet<LectureStudioModel.Network>) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.ROOT__CLOCK.equals(eFeature)) {
    		setClock((double) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.ROOT__TIME.equals(eFeature)) {
    		setTime((LectureStudioModel.Time) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (LectureStudioModelPackage.Literals.ROOT__NETWORKS.equals(eFeature)) {
    		getNetworks().clear(); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.ROOT__CLOCK.equals(eFeature)) {
    		setClock((double)0.0); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.ROOT__TIME.equals(eFeature)) {
    		setTime((LectureStudioModel.Time)null); 
    		return;
    	}
    	eDynamicUnset(eFeature);
    }

    @Override
    public String toString(){
		return super.toString();
    }

 	@Override
    public Object eGet(EStructuralFeature eFeature){
    	if (LectureStudioModelPackage.Literals.ROOT__NETWORKS.equals(eFeature))
    		return getNetworks();
    	if (LectureStudioModelPackage.Literals.ROOT__CLOCK.equals(eFeature))
    		return getClock();
    	if (LectureStudioModelPackage.Literals.ROOT__TIME.equals(eFeature))
    		return getTime();
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
if(getTime() != null)
	setResourceCall.accept((SmartObject) getTime());
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
if(getTime() != null)
    ((SmartObject) getTime()).setResourceSilently(r);
	    	}
}
