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
    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorCacheErrorResult
    {
        public readonly bool? Enabled;
        public readonly bool? Locked;
        public readonly bool? PreserveStale;
        public readonly string? TemplateUuid;
        public readonly string? Ttl;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530BehaviorCacheErrorResult(
            bool? enabled,

            bool? locked,

            bool? preserveStale,

            string? templateUuid,

            string? ttl,

            string? uuid)
        {
            Enabled = enabled;
            Locked = locked;
            PreserveStale = preserveStale;
            TemplateUuid = templateUuid;
            Ttl = ttl;
            Uuid = uuid;
        }
    }
}