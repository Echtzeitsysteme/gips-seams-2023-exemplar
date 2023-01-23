package LectureStudioModel.impl;

import LectureStudioModel.Root;
import LectureStudioModel.Network;
import LectureStudioModel.LectureStudioServer;
import LectureStudioModel.Node;
import LectureStudioModel.Data;
import LectureStudioModel.Connection;
import LectureStudioModel.WaitingClientQueue;
import LectureStudioModel.ConnectionData;
import LectureStudioModel.ClientContainer;
import LectureStudioModel.Time;


import LectureStudioModel.LectureStudioModelFactory;
import LectureStudioModel.LectureStudioModelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

public class LectureStudioModelFactoryImpl extends EFactoryImpl implements LectureStudioModel.LectureStudioModelFactory {

	public static LectureStudioModel.LectureStudioModelFactory init() {
		try {
			LectureStudioModelFactory theLectureStudioModelFactory = (LectureStudioModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(LectureStudioModelPackage.eNS_URI);
			if (theLectureStudioModelFactory != null) {
				return theLectureStudioModelFactory;
			}
		} catch (java.lang.Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LectureStudioModelFactoryImpl();
	}

	public LectureStudioModelFactoryImpl() {
		super();
	}

	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case LectureStudioModelPackage.ROOT:
			return createRoot();
		case LectureStudioModelPackage.NETWORK:
			return createNetwork();
		case LectureStudioModelPackage.LECTURE_STUDIO_SERVER:
			return createLectureStudioServer();
		case LectureStudioModelPackage.NODE:
			return createNode();
		case LectureStudioModelPackage.DATA:
			return createData();
		case LectureStudioModelPackage.CONNECTION:
			return createConnection();
		case LectureStudioModelPackage.WAITING_CLIENT_QUEUE:
			return createWaitingClientQueue();
		case LectureStudioModelPackage.CONNECTION_DATA:
			return createConnectionData();
		case LectureStudioModelPackage.CLIENT_CONTAINER:
			return createClientContainer();
		case LectureStudioModelPackage.TIME:
			return createTime();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}
	
	
	@Override
	public LectureStudioModel.Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}
	@Override
	public LectureStudioModel.Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}
	@Override
	public LectureStudioModel.LectureStudioServer createLectureStudioServer() {
		LectureStudioServerImpl lectureStudioServer = new LectureStudioServerImpl();
		return lectureStudioServer;
	}
	@Override
	public LectureStudioModel.Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}
	@Override
	public LectureStudioModel.Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}
	@Override
	public LectureStudioModel.Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}
	@Override
	public LectureStudioModel.WaitingClientQueue createWaitingClientQueue() {
		WaitingClientQueueImpl waitingClientQueue = new WaitingClientQueueImpl();
		return waitingClientQueue;
	}
	@Override
	public LectureStudioModel.ConnectionData createConnectionData() {
		ConnectionDataImpl connectionData = new ConnectionDataImpl();
		return connectionData;
	}
	@Override
	public LectureStudioModel.ClientContainer createClientContainer() {
		ClientContainerImpl clientContainer = new ClientContainerImpl();
		return clientContainer;
	}
	@Override
	public LectureStudioModel.Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}
	

	@Override
	public LectureStudioModelPackage getLectureStudioModelPackage() {
	return (LectureStudioModelPackage) getEPackage();
	}
} 
