/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import se.kth.datacloud.dsl.ExecutionRequirements.util.ExecutionRequirementsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionRequirementsItemProviderAdapterFactory extends ExecutionRequirementsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionRequirementsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionRequirementSetItemProvider executionRequirementSetItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutionRequirementSetAdapter() {
		if (executionRequirementSetItemProvider == null) {
			executionRequirementSetItemProvider = new ExecutionRequirementSetItemProvider(this);
		}

		return executionRequirementSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.ExecutionRequirements.Metric} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricItemProvider metricItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.Metric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetricAdapter() {
		if (metricItemProvider == null) {
			metricItemProvider = new MetricItemProvider(this);
		}

		return metricItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptimizationRequirementItemProvider optimizationRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOptimizationRequirementAdapter() {
		if (optimizationRequirementItemProvider == null) {
			optimizationRequirementItemProvider = new OptimizationRequirementItemProvider(this);
		}

		return optimizationRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelConditionItemProvider serviceLevelConditionItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceLevelConditionAdapter() {
		if (serviceLevelConditionItemProvider == null) {
			serviceLevelConditionItemProvider = new ServiceLevelConditionItemProvider(this);
		}

		return serviceLevelConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HorizontalScaleRequirementItemProvider horizontalScaleRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHorizontalScaleRequirementAdapter() {
		if (horizontalScaleRequirementItemProvider == null) {
			horizontalScaleRequirementItemProvider = new HorizontalScaleRequirementItemProvider(this);
		}

		return horizontalScaleRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityRequirementItemProvider securityRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecurityRequirementAdapter() {
		if (securityRequirementItemProvider == null) {
			securityRequirementItemProvider = new SecurityRequirementItemProvider(this);
		}

		return securityRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSRequirementItemProvider osRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOSRequirementAdapter() {
		if (osRequirementItemProvider == null) {
			osRequirementItemProvider = new OSRequirementItemProvider(this);
		}

		return osRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelObjective} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelObjectiveItemProvider serviceLevelObjectiveItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelObjective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceLevelObjectiveAdapter() {
		if (serviceLevelObjectiveItemProvider == null) {
			serviceLevelObjectiveItemProvider = new ServiceLevelObjectiveItemProvider(this);
		}

		return serviceLevelObjectiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityControlItemProvider securityControlItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecurityControlAdapter() {
		if (securityControlItemProvider == null) {
			securityControlItemProvider = new SecurityControlItemProvider(this);
		}

		return securityControlItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantitativeHardwareRequirementItemProvider quantitativeHardwareRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuantitativeHardwareRequirementAdapter() {
		if (quantitativeHardwareRequirementItemProvider == null) {
			quantitativeHardwareRequirementItemProvider = new QuantitativeHardwareRequirementItemProvider(this);
		}

		return quantitativeHardwareRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.ExecutionRequirements.ImageRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageRequirementItemProvider imageRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.ImageRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageRequirementAdapter() {
		if (imageRequirementItemProvider == null) {
			imageRequirementItemProvider = new ImageRequirementItemProvider(this);
		}

		return imageRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerticalScaleRequirementItemProvider verticalScaleRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVerticalScaleRequirementAdapter() {
		if (verticalScaleRequirementItemProvider == null) {
			verticalScaleRequirementItemProvider = new VerticalScaleRequirementItemProvider(this);
		}

		return verticalScaleRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualitativeHardwareRequirementItemProvider qualitativeHardwareRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQualitativeHardwareRequirementAdapter() {
		if (qualitativeHardwareRequirementItemProvider == null) {
			qualitativeHardwareRequirementItemProvider = new QualitativeHardwareRequirementItemProvider(this);
		}

		return qualitativeHardwareRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkRequirementItemProvider networkRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNetworkRequirementAdapter() {
		if (networkRequirementItemProvider == null) {
			networkRequirementItemProvider = new NetworkRequirementItemProvider(this);
		}

		return networkRequirementItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (executionRequirementSetItemProvider != null) executionRequirementSetItemProvider.dispose();
		if (metricItemProvider != null) metricItemProvider.dispose();
		if (optimizationRequirementItemProvider != null) optimizationRequirementItemProvider.dispose();
		if (serviceLevelConditionItemProvider != null) serviceLevelConditionItemProvider.dispose();
		if (horizontalScaleRequirementItemProvider != null) horizontalScaleRequirementItemProvider.dispose();
		if (securityRequirementItemProvider != null) securityRequirementItemProvider.dispose();
		if (osRequirementItemProvider != null) osRequirementItemProvider.dispose();
		if (serviceLevelObjectiveItemProvider != null) serviceLevelObjectiveItemProvider.dispose();
		if (securityControlItemProvider != null) securityControlItemProvider.dispose();
		if (quantitativeHardwareRequirementItemProvider != null) quantitativeHardwareRequirementItemProvider.dispose();
		if (imageRequirementItemProvider != null) imageRequirementItemProvider.dispose();
		if (verticalScaleRequirementItemProvider != null) verticalScaleRequirementItemProvider.dispose();
		if (qualitativeHardwareRequirementItemProvider != null) qualitativeHardwareRequirementItemProvider.dispose();
		if (networkRequirementItemProvider != null) networkRequirementItemProvider.dispose();
	}

}
