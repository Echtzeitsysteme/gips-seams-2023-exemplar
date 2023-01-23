package LectureStudioModel;

import LectureStudioModel.LectureStudioModelPackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface ConnectionData extends EObject {
	
    public java.lang.String getServerId();
    
    public void setServerId(java.lang.String value);
    
    public java.lang.String getClientId();
    
    public void setClientId(java.lang.String value);
    
    public double getBandwidth();
    
    public void setBandwidth(double value);
    

}
