package de.loosetie.k8s.dsl.kubevirt

import de.loosetie.k8s.dsl.K8sApi
import de.loosetie.k8s.dsl.K8sDslMarker

@K8sDslMarker
fun K8sApi.apigroup(init: APIGroup.() -> Unit): APIGroup =
  APIGroup_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.apigrouplist(init: APIGroupList.() -> Unit): APIGroupList =
  APIGroupList_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.apiresourcelist(init: APIResourceList.() -> Unit): APIResourceList =
  APIResourceList_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.deleteoptions(init: DeleteOptions.() -> Unit): DeleteOptions =
  DeleteOptions_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.ownerreference(init: OwnerReference.() -> Unit): OwnerReference =
  OwnerReference_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.persistentvolumeclaim(init: PersistentVolumeClaim.() -> Unit): PersistentVolumeClaim =
  PersistentVolumeClaim_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.restartoptions(init: RestartOptions.() -> Unit): RestartOptions =
  RestartOptions_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.status(init: Status.() -> Unit): Status =
  Status_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachine(init: VirtualMachine.() -> Unit): VirtualMachine =
  VirtualMachine_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachineinstance(init: VirtualMachineInstance.() -> Unit): VirtualMachineInstance =
  VirtualMachineInstance_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachineinstancefilesystemlist(init: VirtualMachineInstanceFileSystemList.() -> Unit): VirtualMachineInstanceFileSystemList =
  VirtualMachineInstanceFileSystemList_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachineinstanceguestagentinfo(init: VirtualMachineInstanceGuestAgentInfo.() -> Unit): VirtualMachineInstanceGuestAgentInfo =
  VirtualMachineInstanceGuestAgentInfo_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachineinstanceguestosuserlist(init: VirtualMachineInstanceGuestOSUserList.() -> Unit): VirtualMachineInstanceGuestOSUserList =
  VirtualMachineInstanceGuestOSUserList_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachineinstancelist(init: VirtualMachineInstanceList.() -> Unit): VirtualMachineInstanceList =
  VirtualMachineInstanceList_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachineinstancemigration(init: VirtualMachineInstanceMigration.() -> Unit): VirtualMachineInstanceMigration =
  VirtualMachineInstanceMigration_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachineinstancemigrationlist(init: VirtualMachineInstanceMigrationList.() -> Unit): VirtualMachineInstanceMigrationList =
  VirtualMachineInstanceMigrationList_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachineinstancepreset(init: VirtualMachineInstancePreset.() -> Unit): VirtualMachineInstancePreset =
  VirtualMachineInstancePreset_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachineinstancepresetlist(init: VirtualMachineInstancePresetList.() -> Unit): VirtualMachineInstancePresetList =
  VirtualMachineInstancePresetList_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachineinstancereplicaset(init: VirtualMachineInstanceReplicaSet.() -> Unit): VirtualMachineInstanceReplicaSet =
  VirtualMachineInstanceReplicaSet_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachineinstancereplicasetlist(init: VirtualMachineInstanceReplicaSetList.() -> Unit): VirtualMachineInstanceReplicaSetList =
  VirtualMachineInstanceReplicaSetList_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachinelist(init: VirtualMachineList.() -> Unit): VirtualMachineList =
  VirtualMachineList_v1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.datavolume(init: DataVolume.() -> Unit): DataVolume =
  DataVolume_v1alpha1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachinesnapshot(init: VirtualMachineSnapshot.() -> Unit): VirtualMachineSnapshot =
  VirtualMachineSnapshot_v1alpha1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachinesnapshotcontent(init: VirtualMachineSnapshotContent.() -> Unit): VirtualMachineSnapshotContent =
  VirtualMachineSnapshotContent_v1alpha1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachinesnapshotcontentlist(init: VirtualMachineSnapshotContentList.() -> Unit): VirtualMachineSnapshotContentList =
  VirtualMachineSnapshotContentList_v1alpha1_Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.virtualmachinesnapshotlist(init: VirtualMachineSnapshotList.() -> Unit): VirtualMachineSnapshotList =
  VirtualMachineSnapshotList_v1alpha1_Impl()
    .also{manifests.add(it)}
    .apply(init)