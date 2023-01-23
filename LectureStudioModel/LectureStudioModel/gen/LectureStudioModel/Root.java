package LectureStudioModel;

import LectureStudioModel.LectureStudioModelPackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Root extends EObject {
	
    public LinkedSmartESet<LectureStudioModel.Network> getNetworks();
    
    public void setNetworks(LinkedSmartESet<LectureStudioModel.Network> value);
    
    public double getClock();
    
    public void setClock(double value);
    
    public LectureStudioModel.Time getTime();
    
    public void setTime(LectureStudioModel.Time value);
    

}
