// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetCloudwrapperCapacitiesCapacityResult
    {
        public readonly Outputs.GetCloudwrapperCapacitiesCapacityApprovedResult Approved;
        public readonly Outputs.GetCloudwrapperCapacitiesCapacityAssignedResult Assigned;
        public readonly string ContractId;
        public readonly int LocationId;
        public readonly string LocationName;
        public readonly string Type;
        public readonly Outputs.GetCloudwrapperCapacitiesCapacityUnassignedResult Unassigned;

        [OutputConstructor]
        private GetCloudwrapperCapacitiesCapacityResult(
            Outputs.GetCloudwrapperCapacitiesCapacityApprovedResult approved,

            Outputs.GetCloudwrapperCapacitiesCapacityAssignedResult assigned,

            string contractId,

            int locationId,

            string locationName,

            string type,

            Outputs.GetCloudwrapperCapacitiesCapacityUnassignedResult unassigned)
        {
            Approved = approved;
            Assigned = assigned;
            ContractId = contractId;
            LocationId = locationId;
            LocationName = locationName;
            Type = type;
            Unassigned = unassigned;
        }
    }
}
