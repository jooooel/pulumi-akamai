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
    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorEdgeWorkerResult
    {
        public readonly string? CreateEdgeWorker;
        public readonly string? EdgeWorkerId;
        public readonly bool? Enabled;
        public readonly bool? Locked;
        public readonly string? ResourceTier;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530BehaviorEdgeWorkerResult(
            string? createEdgeWorker,

            string? edgeWorkerId,

            bool? enabled,

            bool? locked,

            string? resourceTier,

            string? templateUuid,

            string? uuid)
        {
            CreateEdgeWorker = createEdgeWorker;
            EdgeWorkerId = edgeWorkerId;
            Enabled = enabled;
            Locked = locked;
            ResourceTier = resourceTier;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}