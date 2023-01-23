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

public class NetworkImpl extends SmartObject implements LectureStudioModel.Network {

    protected LinkedSmartESet<LectureStudioModel.LectureStudioServer> lectureStudioServer = new LinkedSmartESet<LectureStudioModel.LectureStudioServer>(this, LectureStudioModelPackage.Literals.NETWORK__LECTURE_STUDIO_SERVER);
	
	protected NetworkImpl() {
		super(LectureStudioModelPackage.Literals.NETWORK);
	}
	
    
    @Override
    public LinkedSmartESet<LectureStudioModel.LectureStudioServer> getLectureStudioServer() {
    	return this.lectureStudioServer;
    }
    
    @Override
    public void setLectureStudioServer(LinkedSmartESet<LectureStudioModel.LectureStudioServer> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (LectureStudioModelPackage.Literals.NETWORK__LECTURE_STUDIO_SERVER.equals(eFeature)) {
    		setLectureStudioServer((LinkedSmartESet<LectureStudioModel.LectureStudioServer>) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (LectureStudioModelPackage.Literals.NETWORK__LECTURE_STUDIO_SERVER.equals(eFeature)) {
    		getLectureStudioServer().clear(); 
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
    	if (LectureStudioModelPackage.Literals.NETWORK__LECTURE_STUDIO_SERVER.equals(eFeature))
    		return getLectureStudioServer();
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
    	for(Object obj : getLectureStudioServer()) {
    		setResourceCall.accept(((SmartObject) obj));
	    		}
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
    	for(Object obj : getLectureStudioServer()) {
    		((SmartObject) obj).setResourceSilently(r);
	    		}
	    	}
}
