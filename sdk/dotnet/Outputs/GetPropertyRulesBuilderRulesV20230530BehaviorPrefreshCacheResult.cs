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
    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorPrefreshCacheResult
    {
        public readonly bool? Enabled;
        public readonly bool? Locked;
        public readonly int? Prefreshval;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530BehaviorPrefreshCacheResult(
            bool? enabled,

            bool? locked,

            int? prefreshval,

            string? templateUuid,

            string? uuid)
        {
            Enabled = enabled;
            Locked = locked;
            Prefreshval = prefreshval;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
