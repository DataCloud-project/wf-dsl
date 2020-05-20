/**
 * generated by Xtext 2.21.0
 */
package workflow.workflowDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.workflowDSL.WFModel;
import workflow.workflowDSL.Workflow;
import workflow.workflowDSL.WorkflowDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WF Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.workflowDSL.impl.WFModelImpl#getWorkflow <em>Workflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WFModelImpl extends MinimalEObjectImpl.Container implements WFModel
{
  /**
   * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkflow()
   * @generated
   * @ordered
   */
  protected EList<Workflow> workflow;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WFModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WorkflowDSLPackage.Literals.WF_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Workflow> getWorkflow()
  {
    if (workflow == null)
    {
      workflow = new EObjectContainmentEList<Workflow>(Workflow.class, this, WorkflowDSLPackage.WF_MODEL__WORKFLOW);
    }
    return workflow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WorkflowDSLPackage.WF_MODEL__WORKFLOW:
        return ((InternalEList<?>)getWorkflow()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WorkflowDSLPackage.WF_MODEL__WORKFLOW:
        return getWorkflow();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WorkflowDSLPackage.WF_MODEL__WORKFLOW:
        getWorkflow().clear();
        getWorkflow().addAll((Collection<? extends Workflow>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WorkflowDSLPackage.WF_MODEL__WORKFLOW:
        getWorkflow().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WorkflowDSLPackage.WF_MODEL__WORKFLOW:
        return workflow != null && !workflow.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WFModelImpl
