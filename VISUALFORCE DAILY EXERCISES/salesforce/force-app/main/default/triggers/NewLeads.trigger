trigger NewLeads on Lead (before insert) {
    for (Lead leads : trigger.new){
        if(leads.Rating == 'Hot'){
            leads.Description = 'priority';
        }
    }
}