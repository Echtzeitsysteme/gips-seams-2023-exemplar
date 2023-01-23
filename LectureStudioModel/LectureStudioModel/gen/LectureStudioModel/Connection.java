package LectureStudioModel;

import LectureStudioModel.LectureStudioModelPackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Connection extends EObject {
	
    public LectureStudioModel.Node getServer();
    
    public void setServer(LectureStudioModel.Node value);
    
    public LectureStudioModel.Node getClient();
    
    public void setClient(LectureStudioModel.Node value);
    
    public double getTransferRate();
    
    public void setTransferRate(double value);
    

}
