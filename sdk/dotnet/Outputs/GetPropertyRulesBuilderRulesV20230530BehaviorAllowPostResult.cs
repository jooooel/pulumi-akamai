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
    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorAllowPostResult
    {
        public readonly bool? AllowWithoutContentLength;
        public readonly bool? Enabled;
        public readonly bool? Locked;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530BehaviorAllowPostResult(
            bool? allowWithoutContentLength,

            bool? enabled,

            bool? locked,

            string? templateUuid,

            string? uuid)
        {
            AllowWithoutContentLength = allowWithoutContentLength;
            Enabled = enabled;
            Locked = locked;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
