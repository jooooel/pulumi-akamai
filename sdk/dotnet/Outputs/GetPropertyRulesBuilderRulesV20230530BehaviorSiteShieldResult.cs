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
    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldResult
    {
        public readonly bool? Locked;
        public readonly string? Nossmap;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapResult? Ssmap;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldResult(
            bool? locked,

            string? nossmap,

            Outputs.GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapResult? ssmap,

            string? templateUuid,

            string? uuid)
        {
            Locked = locked;
            Nossmap = nossmap;
            Ssmap = ssmap;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
