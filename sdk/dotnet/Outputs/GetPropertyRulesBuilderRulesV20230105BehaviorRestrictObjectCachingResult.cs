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
    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorRestrictObjectCachingResult
    {
        public readonly bool? Locked;
        public readonly string? MaximumSize;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230105BehaviorRestrictObjectCachingResult(
            bool? locked,

            string? maximumSize,

            string? templateUuid,

            string? uuid)
        {
            Locked = locked;
            MaximumSize = maximumSize;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
