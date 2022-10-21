trigger TaskDeletion on Task (before delete) {
    
    for (Task task : Trigger.old) {
        if(trigger.isDelete && task.WhatId != null){
            Trigger.oldMap.get(task.Id).addError(
                'Cannot delete task with related items.');
        }            
    }    
}