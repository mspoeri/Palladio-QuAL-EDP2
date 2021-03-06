/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.Repository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc --> <!-- begin-model-doc -->
 * <p>
 * Contains&nbsp;all&nbsp;elements&nbsp;to&nbsp;handle&nbsp;repositories.&nbsp;Repositories&nbsp;are
 * &nbsp;responsible&nbsp;to&nbsp;load/store&nbsp;experiment&nbsp;data.
 * </p>
 * <!-- end-model-doc -->
 *
 * @see org.palladiosimulator.edp2.models.Repository.RepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface RepositoryPackage extends EPackage {

    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "Repository";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/EDP2/Repository/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "org.palladiosimulator.edp2.models";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    RepositoryPackage eINSTANCE = org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl.init();

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.edp2.models.Repository.impl.RepositoryImpl <em>Repository</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoryImpl
     * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl#getRepository()
     * @generated
     */
    int REPOSITORY = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Repositories</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REPOSITORY__REPOSITORIES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Experiment Groups</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REPOSITORY__EXPERIMENT_GROUPS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REPOSITORY__READ_ONLY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Descriptions</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REPOSITORY__DESCRIPTIONS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Repository</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.edp2.models.Repository.impl.LocalMemoryRepositoryImpl
     * <em>Local Memory Repository</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.edp2.models.Repository.impl.LocalMemoryRepositoryImpl
     * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl#getLocalMemoryRepository()
     * @generated
     */
    int LOCAL_MEMORY_REPOSITORY = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LOCAL_MEMORY_REPOSITORY__ID = REPOSITORY__ID;

    /**
     * The feature id for the '<em><b>Repositories</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LOCAL_MEMORY_REPOSITORY__REPOSITORIES = REPOSITORY__REPOSITORIES;

    /**
     * The feature id for the '<em><b>Experiment Groups</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LOCAL_MEMORY_REPOSITORY__EXPERIMENT_GROUPS = REPOSITORY__EXPERIMENT_GROUPS;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LOCAL_MEMORY_REPOSITORY__READ_ONLY = REPOSITORY__READ_ONLY;

    /**
     * The feature id for the '<em><b>Descriptions</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LOCAL_MEMORY_REPOSITORY__DESCRIPTIONS = REPOSITORY__DESCRIPTIONS;

    /**
     * The feature id for the '<em><b>Domain</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LOCAL_MEMORY_REPOSITORY__DOMAIN = REPOSITORY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Local Memory Repository</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LOCAL_MEMORY_REPOSITORY_FEATURE_COUNT = REPOSITORY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.edp2.models.Repository.impl.RemoteCdoRepositoryImpl
     * <em>Remote Cdo Repository</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.edp2.models.Repository.impl.RemoteCdoRepositoryImpl
     * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl#getRemoteCdoRepository()
     * @generated
     */
    int REMOTE_CDO_REPOSITORY = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REMOTE_CDO_REPOSITORY__ID = REPOSITORY__ID;

    /**
     * The feature id for the '<em><b>Repositories</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REMOTE_CDO_REPOSITORY__REPOSITORIES = REPOSITORY__REPOSITORIES;

    /**
     * The feature id for the '<em><b>Experiment Groups</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REMOTE_CDO_REPOSITORY__EXPERIMENT_GROUPS = REPOSITORY__EXPERIMENT_GROUPS;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REMOTE_CDO_REPOSITORY__READ_ONLY = REPOSITORY__READ_ONLY;

    /**
     * The feature id for the '<em><b>Descriptions</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REMOTE_CDO_REPOSITORY__DESCRIPTIONS = REPOSITORY__DESCRIPTIONS;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REMOTE_CDO_REPOSITORY__URL = REPOSITORY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Remote Cdo Repository</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REMOTE_CDO_REPOSITORY_FEATURE_COUNT = REPOSITORY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.edp2.models.Repository.impl.RepositoriesImpl
     * <em>Repositories</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoriesImpl
     * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl#getRepositories()
     * @generated
     */
    int REPOSITORIES = 2;

    /**
     * The feature id for the '<em><b>Available Repositories</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REPOSITORIES__AVAILABLE_REPOSITORIES = 0;

    /**
     * The feature id for the '<em><b>Common Resource Set</b></em>' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REPOSITORIES__COMMON_RESOURCE_SET = 1;

    /**
     * The number of structural features of the '<em>Repositories</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REPOSITORIES_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.emf.ecore.resource.ResourceSet
     * <em>IResource Set</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.ecore.resource.ResourceSet
     * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl#getIResourceSet()
     * @generated
     */
    int IRESOURCE_SET = 3;

    /**
     * The number of structural features of the '<em>IResource Set</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IRESOURCE_SET_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.dao.MeasurementsDaoFactory
     * <em>Measurements Dao Factory</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.edp2.dao.MeasurementsDaoFactory
     * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl#getMeasurementsDaoFactory()
     * @generated
     */
    int MEASUREMENTS_DAO_FACTORY = 4;

    /**
     * The number of structural features of the '<em>Measurements Dao Factory</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEASUREMENTS_DAO_FACTORY_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.dao.MetaDao <em>Meta Dao</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.edp2.dao.MetaDao
     * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl#getMetaDao()
     * @generated
     */
    int META_DAO = 5;

    /**
     * The number of structural features of the '<em>Meta Dao</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int META_DAO_FEATURE_COUNT = 0;

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.edp2.models.Repository.LocalMemoryRepository
     * <em>Local Memory Repository</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Local Memory Repository</em>'.
     * @see org.palladiosimulator.edp2.models.Repository.LocalMemoryRepository
     * @generated
     */
    EClass getLocalMemoryRepository();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.edp2.models.Repository.LocalMemoryRepository#getDomain
     * <em>Domain</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Domain</em>'.
     * @see org.palladiosimulator.edp2.models.Repository.LocalMemoryRepository#getDomain()
     * @see #getLocalMemoryRepository()
     * @generated
     */
    EAttribute getLocalMemoryRepository_Domain();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.edp2.models.Repository.RemoteCdoRepository
     * <em>Remote Cdo Repository</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Remote Cdo Repository</em>'.
     * @see org.palladiosimulator.edp2.models.Repository.RemoteCdoRepository
     * @generated
     */
    EClass getRemoteCdoRepository();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.edp2.models.Repository.RemoteCdoRepository#getUrl <em>Url</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Url</em>'.
     * @see org.palladiosimulator.edp2.models.Repository.RemoteCdoRepository#getUrl()
     * @see #getRemoteCdoRepository()
     * @generated
     */
    EAttribute getRemoteCdoRepository_Url();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.edp2.models.Repository.Repositories <em>Repositories</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Repositories</em>'.
     * @see org.palladiosimulator.edp2.models.Repository.Repositories
     * @generated
     */
    EClass getRepositories();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.palladiosimulator.edp2.models.Repository.Repositories#getAvailableRepositories
     * <em>Available Repositories</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Available Repositories</em>'.
     * @see org.palladiosimulator.edp2.models.Repository.Repositories#getAvailableRepositories()
     * @see #getRepositories()
     * @generated
     */
    EReference getRepositories_AvailableRepositories();

    /**
     * Returns the meta object for the reference '
     * {@link org.palladiosimulator.edp2.models.Repository.Repositories#getCommonResourceSet
     * <em>Common Resource Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Common Resource Set</em>'.
     * @see org.palladiosimulator.edp2.models.Repository.Repositories#getCommonResourceSet()
     * @see #getRepositories()
     * @generated
     */
    EReference getRepositories_CommonResourceSet();

    /**
     * Returns the meta object for class '{@link org.eclipse.emf.ecore.resource.ResourceSet
     * <em>IResource Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>IResource Set</em>'.
     * @see org.eclipse.emf.ecore.resource.ResourceSet
     * @model instanceClass="org.eclipse.emf.ecore.resource.ResourceSet"
     * @generated
     */
    EClass getIResourceSet();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.edp2.dao.MeasurementsDaoFactory
     * <em>Measurements Dao Factory</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Measurements Dao Factory</em>'.
     * @see org.palladiosimulator.edp2.dao.MeasurementsDaoFactory
     * @model instanceClass="org.palladiosimulator.edp2.dao.MeasurementsDaoFactory"
     * @generated
     */
    EClass getMeasurementsDaoFactory();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.dao.MetaDao
     * <em>Meta Dao</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Meta Dao</em>'.
     * @see org.palladiosimulator.edp2.dao.MetaDao
     * @model instanceClass="org.palladiosimulator.edp2.dao.MetaDao"
     * @generated
     */
    EClass getMetaDao();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.edp2.models.Repository.Repository <em>Repository</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Repository</em>'.
     * @see org.palladiosimulator.edp2.models.Repository.Repository
     * @generated
     */
    EClass getRepository();

    /**
     * Returns the meta object for the container reference '
     * {@link org.palladiosimulator.edp2.models.Repository.Repository#getRepositories
     * <em>Repositories</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the container reference '<em>Repositories</em>'.
     * @see org.palladiosimulator.edp2.models.Repository.Repository#getRepositories()
     * @see #getRepository()
     * @generated
     */
    EReference getRepository_Repositories();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.edp2.models.Repository.Repository#isReadOnly <em>Read Only</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Read Only</em>'.
     * @see org.palladiosimulator.edp2.models.Repository.Repository#isReadOnly()
     * @see #getRepository()
     * @generated
     */
    EAttribute getRepository_ReadOnly();

    /**
     * Returns the meta object for the reference list '
     * {@link org.palladiosimulator.edp2.models.Repository.Repository#getDescriptions
     * <em>Descriptions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference list '<em>Descriptions</em>'.
     * @see org.palladiosimulator.edp2.models.Repository.Repository#getDescriptions()
     * @see #getRepository()
     * @generated
     */
    EReference getRepository_Descriptions();

    /**
     * Returns the meta object for the reference list '
     * {@link org.palladiosimulator.edp2.models.Repository.Repository#getExperimentGroups
     * <em>Experiment Groups</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference list '<em>Experiment Groups</em>'.
     * @see org.palladiosimulator.edp2.models.Repository.Repository#getExperimentGroups()
     * @see #getRepository()
     * @generated
     */
    EReference getRepository_ExperimentGroups();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    RepositoryFactory getRepositoryFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.edp2.models.Repository.impl.LocalMemoryRepositoryImpl
         * <em>Local Memory Repository</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.edp2.models.Repository.impl.LocalMemoryRepositoryImpl
         * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl#getLocalMemoryRepository()
         * @generated
         */
        EClass LOCAL_MEMORY_REPOSITORY = eINSTANCE.getLocalMemoryRepository();

        /**
         * The meta object literal for the '<em><b>Domain</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute LOCAL_MEMORY_REPOSITORY__DOMAIN = eINSTANCE.getLocalMemoryRepository_Domain();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.edp2.models.Repository.impl.RemoteCdoRepositoryImpl
         * <em>Remote Cdo Repository</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.edp2.models.Repository.impl.RemoteCdoRepositoryImpl
         * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl#getRemoteCdoRepository()
         * @generated
         */
        EClass REMOTE_CDO_REPOSITORY = eINSTANCE.getRemoteCdoRepository();

        /**
         * The meta object literal for the '<em><b>Url</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute REMOTE_CDO_REPOSITORY__URL = eINSTANCE.getRemoteCdoRepository_Url();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.edp2.models.Repository.impl.RepositoriesImpl
         * <em>Repositories</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoriesImpl
         * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl#getRepositories()
         * @generated
         */
        EClass REPOSITORIES = eINSTANCE.getRepositories();

        /**
         * The meta object literal for the '<em><b>Available Repositories</b></em>' containment
         * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference REPOSITORIES__AVAILABLE_REPOSITORIES = eINSTANCE.getRepositories_AvailableRepositories();

        /**
         * The meta object literal for the '<em><b>Common Resource Set</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference REPOSITORIES__COMMON_RESOURCE_SET = eINSTANCE.getRepositories_CommonResourceSet();

        /**
         * The meta object literal for the '{@link org.eclipse.emf.ecore.resource.ResourceSet
         * <em>IResource Set</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.eclipse.emf.ecore.resource.ResourceSet
         * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl#getIResourceSet()
         * @generated
         */
        EClass IRESOURCE_SET = eINSTANCE.getIResourceSet();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.edp2.dao.MeasurementsDaoFactory
         * <em>Measurements Dao Factory</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.edp2.dao.MeasurementsDaoFactory
         * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl#getMeasurementsDaoFactory()
         * @generated
         */
        EClass MEASUREMENTS_DAO_FACTORY = eINSTANCE.getMeasurementsDaoFactory();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.dao.MetaDao
         * <em>Meta Dao</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.edp2.dao.MetaDao
         * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl#getMetaDao()
         * @generated
         */
        EClass META_DAO = eINSTANCE.getMetaDao();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.edp2.models.Repository.impl.RepositoryImpl
         * <em>Repository</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoryImpl
         * @see org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl#getRepository()
         * @generated
         */
        EClass REPOSITORY = eINSTANCE.getRepository();

        /**
         * The meta object literal for the '<em><b>Repositories</b></em>' container reference
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference REPOSITORY__REPOSITORIES = eINSTANCE.getRepository_Repositories();

        /**
         * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute REPOSITORY__READ_ONLY = eINSTANCE.getRepository_ReadOnly();

        /**
         * The meta object literal for the '<em><b>Descriptions</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference REPOSITORY__DESCRIPTIONS = eINSTANCE.getRepository_Descriptions();

        /**
         * The meta object literal for the '<em><b>Experiment Groups</b></em>' reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference REPOSITORY__EXPERIMENT_GROUPS = eINSTANCE.getRepository_ExperimentGroups();

    }

} // RepositoryPackage
