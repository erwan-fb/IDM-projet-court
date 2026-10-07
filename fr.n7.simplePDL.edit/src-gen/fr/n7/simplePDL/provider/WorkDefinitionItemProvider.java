/**
 */
package fr.n7.simplePDL.provider;

import fr.n7.simplePDL.RessourceLink;
import fr.n7.simplePDL.SimplePDLPackage;
import fr.n7.simplePDL.WorkDefinition;
import fr.n7.simplePDL.WorkSequence;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.n7.simplePDL.WorkDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLinksToPredecessorsPropertyDescriptor(object);
			addLinksToSuccessorsPropertyDescriptor(object);
			addLinkToRessourcePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Links To Predecessors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinksToPredecessorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_WorkDefinition_linksToPredecessors_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_WorkDefinition_linksToPredecessors_feature",
						"_UI_WorkDefinition_type"),
				SimplePDLPackage.Literals.WORK_DEFINITION__LINKS_TO_PREDECESSORS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Links To Successors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinksToSuccessorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_WorkDefinition_linksToSuccessors_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_WorkDefinition_linksToSuccessors_feature",
						"_UI_WorkDefinition_type"),
				SimplePDLPackage.Literals.WORK_DEFINITION__LINKS_TO_SUCCESSORS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Link To Ressource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkToRessourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_WorkDefinition_linkToRessource_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_WorkDefinition_linkToRessource_feature",
						"_UI_WorkDefinition_type"),
				SimplePDLPackage.Literals.WORK_DEFINITION__LINK_TO_RESSOURCE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_WorkDefinition_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_WorkDefinition_name_feature",
								"_UI_WorkDefinition_type"),
						SimplePDLPackage.Literals.WORK_DEFINITION__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns WorkDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WorkDefinition"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WorkDefinition) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_WorkDefinition_type")
				: getString("_UI_WorkDefinition_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		WorkDefinition workDefinition = (WorkDefinition) notification.getNotifier();
		List<WorkSequence> predecessors = workDefinition.getLinksToPredecessors();
		List<WorkSequence> successors = workDefinition.getLinksToSuccessors();
		List<RessourceLink> ressources = workDefinition.getLinkToRessource();

		switch (notification.getFeatureID(WorkDefinition.class)) {
		case SimplePDLPackage.WORK_DEFINITION__NAME:

			if (predecessors != null && !predecessors.isEmpty()) {
				for (WorkSequence workSequence : predecessors) {
					workSequence.eNotify(new ENotificationImpl((InternalEObject) workSequence, Notification.SET,
							SimplePDLPackage.WORK_SEQUENCE__PREDECESSOR, notification.getOldValue(),
							notification.getNewValue()));
				}
			}
			if (successors != null && !successors.isEmpty()) {
				for (WorkSequence workSequence : successors) {
					workSequence.eNotify(new ENotificationImpl((InternalEObject) workSequence, Notification.SET,
							SimplePDLPackage.WORK_SEQUENCE__PREDECESSOR, notification.getOldValue(),
							notification.getNewValue()));
				}
			}
			if (ressources != null && !ressources.isEmpty()) {
				for (RessourceLink link : ressources) {
					link.eNotify(new ENotificationImpl((InternalEObject) link, Notification.SET,
							SimplePDLPackage.WORK_SEQUENCE__PREDECESSOR, notification.getOldValue(),
							notification.getNewValue()));
				}
			}
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SimplePDLEditPlugin.INSTANCE;
	}

}
