package LectureStudioModel;

import LectureStudioModel.LectureStudioModelPackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Network extends EObject {
	
    public LinkedSmartESet<LectureStudioModel.LectureStudioServer> getLectureStudioServer();
    
    public void setLectureStudioServer(LinkedSmartESet<LectureStudioModel.LectureStudioServer> value);
    

}
