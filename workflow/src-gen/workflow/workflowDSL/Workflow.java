/**
 * generated by Xtext 2.21.0
 */
package workflow.workflowDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.workflowDSL.Workflow#getName <em>Name</em>}</li>
 *   <li>{@link workflow.workflowDSL.Workflow#getBase <em>Base</em>}</li>
 *   <li>{@link workflow.workflowDSL.Workflow#getParams <em>Params</em>}</li>
 *   <li>{@link workflow.workflowDSL.Workflow#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see workflow.workflowDSL.WorkflowDSLPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see workflow.workflowDSL.WorkflowDSLPackage#getWorkflow_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link workflow.workflowDSL.Workflow#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' reference.
   * @see #setBase(Workflow)
   * @see workflow.workflowDSL.WorkflowDSLPackage#getWorkflow_Base()
   * @model
   * @generated
   */
  Workflow getBase();

  /**
   * Sets the value of the '{@link workflow.workflowDSL.Workflow#getBase <em>Base</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' reference.
   * @see #getBase()
   * @generated
   */
  void setBase(Workflow value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link workflow.workflowDSL.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see workflow.workflowDSL.WorkflowDSLPackage#getWorkflow_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

  /**
   * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
   * The list contents are of type {@link workflow.workflowDSL.Step}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Steps</em>' containment reference list.
   * @see workflow.workflowDSL.WorkflowDSLPackage#getWorkflow_Steps()
   * @model containment="true"
   * @generated
   */
  EList<Step> getSteps();

} // Workflow
