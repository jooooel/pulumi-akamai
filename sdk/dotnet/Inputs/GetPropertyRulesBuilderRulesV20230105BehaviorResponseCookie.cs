// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorResponseCookieArgs : global::Pulumi.InvokeArgs
    {
        [Input("cookieName")]
        public string? CookieName { get; set; }

        [Input("defaultDomain")]
        public bool? DefaultDomain { get; set; }

        [Input("defaultPath")]
        public bool? DefaultPath { get; set; }

        [Input("domain")]
        public string? Domain { get; set; }

        [Input("duration")]
        public string? Duration { get; set; }

        [Input("enabled")]
        public bool? Enabled { get; set; }

        [Input("expirationDate")]
        public string? ExpirationDate { get; set; }

        [Input("expires")]
        public string? Expires { get; set; }

        [Input("format")]
        public string? Format { get; set; }

        [Input("httpOnly")]
        public bool? HttpOnly { get; set; }

        [Input("locked")]
        public bool? Locked { get; set; }

        [Input("path")]
        public string? Path { get; set; }

        [Input("sameSite")]
        public string? SameSite { get; set; }

        [Input("secure")]
        public bool? Secure { get; set; }

        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        [Input("type")]
        public string? Type { get; set; }

        [Input("uuid")]
        public string? Uuid { get; set; }

        [Input("value")]
        public string? Value { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorResponseCookieArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorResponseCookieArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorResponseCookieArgs();
    }
}